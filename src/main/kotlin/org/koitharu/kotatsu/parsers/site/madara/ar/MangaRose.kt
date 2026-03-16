package org.koitharu.kotatsu.parsers.site.madara.ar

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.ContentType
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAROSE", "MangaRose", "ar", ContentType.HENTAI)
internal class MangaRose(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAROSE, "mangarose.net", pageSize = 20)
