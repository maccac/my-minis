package org.github.maccac.mybudget.ledger

import org.springframework.data.jpa.repository.JpaRepository
import java.math.BigDecimal

interface LedgerRepository : JpaRepository<Ledger, BigDecimal>

interface TransactionRepository : JpaRepository<Transaction, BigDecimal>

interface LabelRepository : JpaRepository<TransactionLabel, String>