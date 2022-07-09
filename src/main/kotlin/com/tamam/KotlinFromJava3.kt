@file:JvmName("tamam3")
@file:JvmMultifileClass

package com.tamam

import java.net.IDN
import java.time.LocalDateTime


class User3(id: String) {
    //    java field
//    @JvmField
    companion object {

        var ID = 23;
        @JvmField
        var myName = "corolla"
        @JvmStatic
        var myStatic = "rav4"
    }
}