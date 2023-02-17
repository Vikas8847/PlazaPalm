package com.example.plazapalm.models

data class RequestBookProfile(
    val category_name: String,
    val choose_date: String,
    val choose_time: String,
    val description: String,
    val post_profile_id: String,
    val question_answer: List<QuestionAnswer11>
)

data class QuestionAnswer11(
    val answer_text: String,
    val q_id: String,
    val question_text: String
)