package com.princebillygk.oauthrestapilogintest.api.responses.otp

import com.princebillygk.oauthrestapilogintest.api.responses.common.Response
import com.squareup.moshi.Json


data class OtpRequestResponse(
    @field:Json(name="status_code") override val statusCode: Int,
    @field:Json(name="error_code") override val errCode: Int?,
    @field:Json(name="developer_message") override val developerMessage: String?,
    @field:Json(name="user_message") override val userMessage: String?,
    @field:Json(name = "otp_session_id") val otpSessionId: String,
    @field:Json(name = "expires_in") val otpSessionExpiresIn: Int
):Response