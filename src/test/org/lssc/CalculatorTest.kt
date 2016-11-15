package org.lssc

import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class CalculatorTest : Spek({
    describe("a calculator") {
        val calculator = Calculator();

        it("should return the result of adding the first number to the second number") {
            val sum = calculator.add(2, 4)
            sum.should.equal(6)
        }

        it("should return the result of subtracting the second number from the first number") {
            val subtract = calculator.subtract(4, 2)
            subtract.should.equal(2)
        }
    }
})

