package com.weatherapp

import com.weatherapp.extensions.toDateString
import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.DateFormat

class ExtensionsTest {

    @Test
    fun `"longToDateString" returns valid value`() {
        assertEquals("19-oct-2015", 1445275635000L.toDateString())
    }

    @Test
    fun `"longToDateString" with full format returns valid value`() {
        assertEquals("lunes 19 de octubre de 2015", 1445275635000L.toDateString(DateFormat.FULL))
    }

}