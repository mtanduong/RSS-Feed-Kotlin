package com.mtanduong.rssfeedapp

import android.util.Log
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.lang.Exception

class ParseApplications {
    private val TAG = "ParseApplications"
    val applications = ArrayList<FeedEntry>()

    fun parse(xmlData: String): Boolean {
        Log.d(TAG, "parse called with $xmlData")
        var status = true
        var inEntry = false
        var testValue = ""

        try {
            val factory = XmlPullParserFactory.newInstance()
            factory.isNamespaceAware = true
            val xpp = factory.newPullParser()
            xpp.setInput(xmlData.reader())
            var currentRecord = FeedEntry()
            var eventType = xpp.eventType
            while (eventType != XmlPullParser.END_DOCUMENT) {

            }
        } catch (e: Exception) {
            e.printStackTrace()
            status = false
        }

        return status
    }
}