package team.me.domain.lesson.domain

import team.me.domain.lesson.domain.enums.LessonDevice
import team.me.domain.lesson.domain.enums.LessonType

/**
 * @author Doyeop Kim
 * @since 2024/01/21
 */
class Lesson private constructor(
    val lessonId: String,
    val lessonType: LessonType,
    val studentId: String,
    val tutorId: String,
    val device: LessonDevice,
) {
    companion object {
        fun generateLesson(
            id: LessonDomainId,
            type: LessonDomainType,
            studentId: LessonDomainStudentId,
            tutorId: LessonDomainTutorId,
            device: LessonDomainDevice,
        ): Lesson {
            return Lesson(id.value, type.value, studentId.value, tutorId.value, device.value)
        }

        class LessonDomainId(val value: String)

        class LessonDomainType(val value: LessonType)

        class LessonDomainStudentId(val value: String)

        class LessonDomainTutorId(val value: String)

        class LessonDomainDevice(val value: LessonDevice)
    }
}
