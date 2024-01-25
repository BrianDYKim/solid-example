package team.me.api.lesson.presentation

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import team.me.common.annotations.hexagonal.WebAdapter

/**
 * @author Doyeop Kim
 * @since 2024/01/21
 */
@WebAdapter
@RestController
@RequestMapping("/kapi/lesson")
class LessonController
