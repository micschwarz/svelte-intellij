// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package dev.blachut.svelte.lang.index

import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.psi.impl.cache.impl.BaseFilterLexerUtil
import com.intellij.psi.impl.cache.impl.id.IdIndexEntry
import com.intellij.psi.impl.cache.impl.id.LexingIdIndexer
import com.intellij.util.indexing.FileContent
import dev.blachut.svelte.lang.SvelteHTMLLanguage

class SvelteIdIndexer : LexingIdIndexer {
    override fun map(inputData: FileContent): Map<IdIndexEntry, Int> {
        return BaseFilterLexerUtil.scanContent(inputData) { consumer ->
            SvelteFilterLexer(
                consumer,
                SyntaxHighlighterFactory.getSyntaxHighlighter(
                    SvelteHTMLLanguage.INSTANCE, inputData.project, inputData.file
                ).highlightingLexer
            )
        }.idMap
    }

    override fun getVersion(): Int {
        return 1
    }
}