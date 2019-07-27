package ru.xpendence.taxhelpernotificationservice.dto

import java.io.Serializable

/**
 * Author: Vyacheslav Chernyshov
 * Date: 27.07.19
 * Time: 18:36
 * e-mail: v.chernyshov@pflb.ru
 */
open class MessageDto : Serializable {

    val to: String? = null
    val from: String? = null
    val subject: String? = null
    val text: String? = null
}