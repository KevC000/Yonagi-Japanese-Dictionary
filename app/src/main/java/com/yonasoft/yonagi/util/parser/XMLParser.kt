package com.yonasoft.yonagi.util.parser

import java.io.InputStream


interface XMLParser<T> {
    suspend fun parse(stream: InputStream): List<T>
}