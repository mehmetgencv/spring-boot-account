package com.mehmetgenc.account.dto

data class CustomerDto(
        val id: String?,
        val name: String?,
        val surname: String?,
        val accounts: Set<CustomerAccountDto>?
)
