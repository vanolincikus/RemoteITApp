package com.volkov.remoteit.model


import com.google.gson.annotations.SerializedName

data class RemoteJob(
    @SerializedName("job-count")
    val jobCount: Int?,
    @SerializedName("jobs")
    val jobs: List<Job>?,
    @SerializedName("0-legal-notice")
    val legalNotice: String?
)