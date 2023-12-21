package com.example.demo

import com.example.demo.view.ActionViewComponent
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val actionViewComponent: ActionViewComponent
) {

    @GetMapping("/action")
    fun actionComponent() = actionViewComponent.render()
}
