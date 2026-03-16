package org.koitharu.kotatsu.parsers.site.madara.ar

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.ContentType
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("OLAOE", "Olaoe", "ar", ContentType.HENTAI)
internal class Olaoe(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.OLAOE, "olaoe.cyou") {
	override val datePattern = "dd-MM-yyyy"
	override val tagPrefix = "/شوجو"
	override val listUrl = "works/"
}
