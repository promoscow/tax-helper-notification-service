package ru.xpendence.taxhelpernotificationservice.service

import ru.xpendence.taxhelpernotificationservice.dto.EmailMessageDto
import ru.xpendence.taxhelpernotificationservice.dto.ResponseDto

/**
 * Author: Vyacheslav Chernyshov
 * Date: 27.07.19
 * Time: 18:46
 * e-mail: v.chernyshov@pflb.ru
 */
interface EmailService {

    fun send(dto: EmailMessageDto): ResponseDto
}