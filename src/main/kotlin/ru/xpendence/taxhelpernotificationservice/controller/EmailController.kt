package ru.xpendence.taxhelpernotificationservice.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.xpendence.taxhelpernotificationservice.dto.EmailMessageDto
import ru.xpendence.taxhelpernotificationservice.dto.ResponseDto
import ru.xpendence.taxhelpernotificationservice.service.EmailService

/**
 * Author: Vyacheslav Chernyshov
 * Date: 27.07.19
 * Time: 18:53
 * e-mail: v.chernyshov@pflb.ru
 */
@RestController
@RequestMapping("/email")
class EmailController {

    @Autowired
    lateinit var service: EmailService

    @PostMapping
    fun send(@RequestBody dto: EmailMessageDto): ResponseEntity<ResponseDto> = ResponseEntity.ok(service.send(dto))
}