package com.mehmetgenc.account.dto

import com.mehmetgenc.account.model.Customer
import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(
        val id: String?,
        val balance: BigDecimal?,
        val creationDate: LocalDateTime,
        val customer: AccountCustomerDto?,
        val transactions: Set<TransactionDto>?
)
