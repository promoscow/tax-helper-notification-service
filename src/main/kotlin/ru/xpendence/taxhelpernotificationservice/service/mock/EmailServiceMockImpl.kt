package ru.xpendence.taxhelpernotificationservice.service.mock

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service
import ru.xpendence.taxhelpernotificationservice.dto.EmailMessageDto
import ru.xpendence.taxhelpernotificationservice.dto.ResponseDto
import ru.xpendence.taxhelpernotificationservice.service.EmailService

/**
 * Author: Vyacheslav Chernyshov
 * Date: 27.07.19
 * Time: 18:27
 * e-mail: v.chernyshov@pflb.ru
 */
@Profile(value = ["h2-mock"])
@Service
class EmailServiceMockImpl : EmailService {

    override fun send(dto: EmailMessageDto): ResponseDto {
        return ResponseDto("id:1000")
    }
}