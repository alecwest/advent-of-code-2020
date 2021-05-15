package com.alecnwest
package advent.puzzles.binaryboarding

import com.alecnwest.advent.utils.InputParser
import org.scalatest.{Matchers, WordSpecLike}

class BinaryBoardingTest extends WordSpecLike with Matchers {

  "BinaryBoardingTest" when {
    "highestSeatID" should {
      "return the highest id" in {
        BinaryBoarding.highestSeatID(
          InputParser.parse[String](
            "BFBBFFFLRR\nFFBFBBBLLL\nFBFBFBFLLL\nBBFFFBFLLR\nFBFFBBFLRR\nBBFBFFFLLL\nFFBBFFFRLL\nBFBFBBBRRR\nFBFFBFFRLR\nFBBBBBBLLL\nBBFBBBBLLL\nBFFFBBBLLL\nFFBFFFBRLR\nBFFFFBFLLR\nFFBBBFBLRL\nBFFBFBBRRL\nFBFBFBBRRR\nFBFFFBBRRL\nFBFBBBFRLR\nBFFFFFBRRL\nBBFFFBBLRR\nFFBBBBBRRR\nFFBBBBBLLL\nBBFBFFBRLR\nFBFFBFBRRR\nFFFBBBBRLL\nBBFBFFBLLR\nBFBFFFBRLL\nFFBFBFFLLR\nFBFBBFBRLL\nFBFFBBBLLL\nFBFBBBFRLL\nFBFBFBBRLL\nBFFFFBBRLL\nFFFBBFFLLR\nFFBFFFBLRL\nFFBFBBFLLL\nBFBBFBBLLL\nBFFFFBBRRL\nFFBFFFBRLL\nBFBBFFFRRR\nFFBBFFFLRL\nFFBFBFBRLL\nBFBFBBBLLL\nBBFBBFFLRL\nBFFFFBBLLR\nFFBFBBFRLR\nFFBBFBBLLR\nFBFFBBFLLL\nBFBFBFBLLL\nBFFBFBBLLR\nFBBBBFFRLR\nFBBBFBFRLL\nFBBBBFFLRR\nBFFBBBBLRL\nFBFFBBFLRL\nBBFFFBBLLR\nFBFBFFFRLL\nFBBBFBBRRL\nFFBBBFBLLR\nBFFBBBFLLR\nBFFFFBFRLR\nBBFFFFBLLR\nFBBFFFBRRL\nBFFFBFBRRR\nFBFBFFFRRR\nBBBFFFBLRL\nBFBFBFBLLR\nBFBBBBBLRL\nFFBBFBBRRR\nFBBFFFBRRR\nFFBFBFBRRR\nBBFFFFBRRL\nBFBBBBBLLL\nBFBFBFFRLL\nBFBFBFBRRL\nBFBFFFFLRL\nFFBBBBBLLR\nFBBFBFFRLL\nFBBFFBBLLL\nBFFFFFFLRL\nFFFBBFFLRL\nFFFBBFFRLL\nFFBFFFBLLL\nFBBFBFBLRL\nBBFFFFBRLR\nFBBFBBBRLR\nFFBBFFBLLL\nFFBFFFBRRR\nFBFBFBFRRL\nFFBBBFBRRL\nBBFFBFFLRR\nFBFFFFFRRR\nFBBFFFBRLL\nFFBBFBBRRL\nFFBBFFFLLR\nFBFBBFBLLL\nBFFFBBFLRR\nBFBFBFFLRR\nBFFFFBFRRR\nBBFBBFFRLL\nBFBBBBBLRR\nBFBBBBFLLL\nBBFBBBBLLR\nFFBBBFFRRR\nBBFFBFBLRR\nFFFBBBFRLR\nBFBFFFBLRR\nBFFFBBFLLL\nFBBBBFFLRL\nFBBFFFFRRL\nFFBFFBBRRL\nBFBBBBBRLR\nFBBFFBBLRL\nBBFBFBBRLL\nFBFFBFBRLR\nFBBBBFFLLR\nFBBFBBFRRL\nFBFBBBBRLL\nBFFBFBFRLL\nFFBFBBFRRL\nFBFFFBFRRL\nFBFFBBFRRL\nFFBFBBFRLL\nBBFBBBBLRL\nBFFFBBBRRL\nFFBFFFBLRR\nFFBBFBBLRL\nBFBFBBFRRR\nBFFFFFFRRL\nFBBBBBBRRR\nFBFBBFBLRR\nFBFFFFFRLR\nBFFBBBFLRR\nBFBBFFBLLL\nFBFFFFBLRL\nFFBBBBBLRL\nFFFBBBFRLL\nFFBBFBFRLL\nFBFBBBFLRL\nFFBBBFBRLL\nBBFBBFBLRL\nFFBFBFFRLR\nBBFBBBBLRR\nFFFBBBBRRR\nFBBBFBFLLL\nBFFFBFBRLR\nFBBFBBFRRR\nFBFFBBBRLR\nFBFBBFBRLR\nFBBBFBBLLL\nBBFBFBFLLL\nFFBBFBBRLL\nFBBFBBBLRR\nBFFFBBFRRL\nBFBFFBFLRR\nBBFBBBFLLL\nBFFFBBFRLR\nBFBBFBFLRL\nFBBBBBFRRR\nFBFFFBBRRR\nBBFFFFBLRR\nFBFBFBFLRL\nBBFFBBBRLL\nFFBBBFFLRR\nFFBBBBFLRR\nFBFBFBBRRL\nBBFBFFBRRL\nFBBBFFBLLL\nBFBFFFFLLR\nFFBFFBFLRR\nBFBBFFFLLR\nBBFBBFFLRR\nBFFFFFFLLR\nBBFFBFBRRL\nFBBBFBBRLL\nBFBBBFBLLR\nBFBBFFBRLR\nFBFBBBFRRR\nBFBBBBBRRR\nFFBBFBBRLR\nFBBFBBFRLR\nBFFBBFBRLR\nFBFFFFFLLL\nFBBFFBFRLL\nFBBBBFFRRL\nFBFBBBBLRL\nFFFBBFBLRR\nFFBFFBBLRR\nFFBBBBBLRR\nFBBFFBFRRR\nFBBBFBFRRR\nFBBFBBBLLR\nBFFFFBFLLL\nFFBFFFFRRL\nBFBFFBBLRL\nFFBFFFFRLR\nFBFBFBFRLL\nBBFBFBBRRL\nFFBFBBFLLR\nBFBBFFBLLR\nFBFFBFFLLL\nBFFBBFBRRR\nFBFFFBBRLL\nBBFBBFFRRR\nFBFBBFBLRL\nFBFBFBBLRL\nFBFFBBFRRR\nFBFFBBBLRL\nFFBFBBBRRR\nBFBBBFFLLR\nFFBBFFFRRL\nFFBBBBBRRL\nFFBFFBBRLL\nFFBBFBFLLR\nFBBBFBFLLR\nBFFFBFFRLL\nFFBBBFBLRR\nBFFBBBFRRR\nBFBBFBBRRR\nBBFBFFFRRR\nFBBFFFBLRL\nBBFBBBFLLR\nBBFFFBBLRL\nFBBFFFFLRR\nBFFBFFFRRL\nFFBFBBBRLL\nBBFBBFBRLL\nFBFFFBBLRR\nBFBFBBFRLL\nFBFBBBBRRL\nFFFBBBFLLR\nFBFFFFBRRR\nFBBBBBBRLR\nBBFBFBFRRR\nBFBFFBFRLL\nBFBBBFFLLL\nBFBBBFBLLL\nFBFFBFBLRL\nFFBFFFFLLR\nFBBBBBFLLL\nBBFFBFBLLR\nBBFBBBFLRR\nBFFFFFFRRR\nBFFBFFBRRR\nBFFBBFFLLL\nFFFBBBFLLL\nBFFBBFFRRR\nBBFBBBBRRL\nFBFBBFFLRR\nBFBFFBBLLR\nBFBFFBBRRL\nBFBBFFFLLL\nBFBFFBBRRR\nBFBBFBFRRL\nFBFBFFFLLR\nBFBFBFFLLR\nBFBBBBFRRL\nBFFFBFFLRR\nFBBFBBBRRL\nBBFFFBBRLL\nFFBFBBBLRR\nFFBBFFBRLL\nFBBBFBFRRL\nFFBFFFFLRL\nBFFFBBBRLL\nBFBBBFFRRR\nFFBFFBBRRR\nBFBFFFBLLR\nFBFFFBFLLR\nFBFBBFFRRL\nFFBFFBBLLL\nBBFBBBFLRL\nBFBFBBFRRL\nBFFFBFFLLL\nFBBBFFFRLL\nBBBFFFFLLR\nBFFBFFBLRL\nBBFFBBBLLL\nBFFBFFBLLR\nBBFFBBBLRL\nFBBFFBBLLR\nFFBFBBFRRR\nFBFBBFBRRR\nBFBFFBFRLR\nBFBBBFBRLL\nFFBBBBFLRL\nBFFBFBFLLR\nBFBBFFFRLL\nBBFBFBBLRR\nFBBFBFFLLL\nFBBFFFFLRL\nFBBBBFBRRL\nFFBBBFFRLL\nFBBFBFFRRL\nFBBBFBFRLR\nFBBBFFBLRR\nBBFFBBBLRR\nFBBFFBFLLL\nFBFBBFFRLL\nFFBFBFFRLL\nBFBFBBBRRL\nFBFBBBFRRL\nFFBFBBBLLR\nBFFBFFFRLR\nFFBFBFFRRL\nBBFFFFFLRL\nFBFFBFFLRL\nBBFFFBFLLL\nBFFBBFBLRR\nBFBBFBFLLR\nFBFBFBFLRR\nBBFFBBFRLL\nBBFBFBFRLL\nBBFFFBFRLR\nBFFBFBFRRL\nBFFBFBBLRL\nFFFBBBFLRL\nFBBBFFFRRL\nFFBFBBFLRR\nFBBFBFBRLR\nFFFBBFFRRR\nFBBBBBBLRL\nBBFFBBFRRR\nFFBFFBFLLL\nBFFFBBFLRL\nFBFBBBFLRR\nBBFFBFBLLL\nFBFFBBFRLR\nBFFBFBBLLL\nBFBBFFBLRR\nFFBBBFFLLR\nFBFBFFFRRL\nBFBBFBBRLL\nBBFBBFBLRR\nFBBFFFFLLR\nBFFFBBFRRR\nBBFFFBFRRR\nBBFBBFFLLL\nBBFFBFBRLL\nBBBFFFFRLR\nBFFFFBFRLL\nFFBBBFFRRL\nBFFBBBFLRL\nBBFBBBFRLL\nFBFFFFBRLL\nBFBFFBFLRL\nFFBFFBBLRL\nFBBBBBBLRR\nBBFFFBFRLL\nBFBFFBBRLR\nBBFBFFBLLL\nBFFFBFFRRR\nFFBFFBFLRL\nFBBFBFFLRR\nBBFBFFBRRR\nBBFBFFBLRL\nFBBBBFBLRR\nBBFFBBBRRR\nBBFFBFFLLR\nFBBBFFBRLL\nBFBFFBBLLL\nFBBFBBBLLL\nFFBBFBBLRR\nFBBBBFFLLL\nBFBFBBFLRL\nBFBBBFBRRL\nBFBBBBFRLL\nFFBBFFFRLR\nBBFBBBFRLR\nBFBBFBBRLR\nFFFBBBBLLL\nBFFFFFBLRL\nFBFBFFBRLL\nFBBFBBBRLL\nFBBFBBFRLL\nBFBFBBFLLR\nFFBBFBFLRL\nFBBBFFBRRL\nFFBFFBFRRR\nBBFFFFBRLL\nFBBFFBFRRL\nBBFFFFFRLR\nFBFBFFBLRR\nBFFBBFBRLL\nBBFFFFFLRR\nBBFFBBBRRL\nBBFFBFFRLR\nFFBBFFBLLR\nFBBFFFBLRR\nBFFBBBBRLL\nFBFBFBBLRR\nFBBFBFBRLL\nFBBBFFFRRR\nFBBFFBBRLL\nFFBFFFFRLL\nFFBBBFBLLL\nFBFFBBBLRR\nFFBBFFBRRR\nFFFBBFBRRR\nFBFBFFBRRR\nFFBFFBFRLR\nBFFFFFFLLL\nFFBFFBFRRL\nBFBFBFFLLL\nBFFBBBBRRR\nBFFBBFBRRL\nBBFFBBBRLR\nBBFFBFFRRR\nBBFBFBFRLR\nFFBBFBFLRR\nFBFFBFBLRR\nBBFBBBBRLL\nBBFFFFFLLL\nFBFFBFFLRR\nBBBFFFBRRL\nBFFBFFBRRL\nBFBBBFBRRR\nFFFBBFBRLL\nBFFBBFBLLR\nBFBBBBFRLR\nBFFFFBFLRL\nFBBFBFBRRR\nBFFBFBBLRR\nBBFBBFBLLL\nFBFBFFBRLR\nFFBBBBFRLL\nBFBFFBBRLL\nBBFBBBBRLR\nFFFBBBBLRL\nFFFBBFBLLR\nBFBBFBFLRR\nFFFBBFBLRL\nFBBBBBFLLR\nFBFFBFBRLL\nBFBFBBBRLL\nBFBBBBFRRR\nFBBFBFBRRL\nBBFFBBFRLR\nFFFBBBBRLR\nBFBFBBBLRR\nFBBBBFBRLR\nBBFBFBBLRL\nFFBBBFFRLR\nBFBBBFFLRR\nFBFBBBBLRR\nFBBFFFBRLR\nBFFFFFBLRR\nBFFBBBBRLR\nFBBBFFFRLR\nBBBFFFFLRR\nBFBFBFBRRR\nFFBFFBFRLL\nBBFBFBFLRR\nBFBBFBBLLR\nFFBBBBBRLL\nFFFBBBBLRR\nFBBFBBFLRL\nBFFFBFBLLL\nBFBFFFFRLL\nFBFFFBFLRL\nBBFFFFFRRR\nFBBFBBFLLL\nFBBFBFFRLR\nFFFBBFFLRR\nBFBBFFFRRL\nFBFFFBBRLR\nBBFBFFFRLL\nFBBFFBBRRL\nBBBFFFFRLL\nBFBBBBBRLL\nFFFBBFFRRL\nFBBFFFBLLR\nBFFFBFFLLR\nFFBFFBFLLR\nFBBFFBBRRR\nBFFFFFBRLL\nBFFFBFFRRL\nBBFBBBFRRR\nBFFBFBFLRR\nFBFBBFFRLR\nBBFFFBFLRR\nBBFBFBFLLR\nBFFBBBFLLL\nFBFBFBBLLR\nFBBBBBBRLL\nFBFBFFFLRL\nFFBBFFBRLR\nBBFBBFBRRL\nBBFBBFBRLR\nBFFBBFFLRR\nBFFBFFFLRR\nBFBFBFFRRL\nBBFBBBBRRR\nFBFFFFFLLR\nBBFFBBFLLR\nBFFFBBBRLR\nFBBBBFFRLL\nBBFBBFFRRL\nBBFFBFFRLL\nBFBFBFBLRL\nBFBFFFBLLL\nBBFBFFFRLR\nFBBBFFFLRL\nFFFBBBBLLR\nFFBFFFFLRR\nBBFBFBFRRL\nFBFFBBBRLL\nFBBBFBBLRL\nBBBFFFFLLL\nFFBFBBBRRL\nFBFBFFBLLR\nFBFFFFFLRL\nBFBFBBBLRL\nBFFBBFFRLR\nBFBFFBBLRR\nBFFBFBBRLR\nFBBFBFBLRR\nFFBBBFFLRL\nBBFFBBFLRR\nFBBBFBBRRR\nBFFFBBBLLR\nBFBFBBBRLR\nBFFBFBFLLL\nBBBFFFBRRR\nBBBFFFBRLR\nFBFBBFFLLL\nBFFBBFFLLR\nFFBBFFBLRR\nFBBBBBFRLR\nBFBBFFBRRL\nFBBBFFFLRR\nFBFFFFFRLL\nFFBFFFBLLR\nBFFBFFFRLL\nBFBFBFBRLL\nBFFFFBBLRR\nFBBFFBBLRR\nBFBBBFBLRL\nBBFBFBBLLR\nBFBBBFBLRR\nFBFFFBFLLL\nBFBBBBBLLR\nBFBFFFBRLR\nBFBFBBFLLL\nBBBFFFFRRR\nFBBFFBBRLR\nBBBFFFFLRL\nFBBFBBBRRR\nFFBBFBFRRL\nBFFFBBBRRR\nFFBFBFFRRR\nBBFBFFFLRR\nFFBFBBBLRL\nBFBFBFFRLR\nFFBBFFFRRR\nFBFFBFBLLL\nFBFFBFBLLR\nBBFBBFFLLR\nBFBBBFFRLR\nBFFFFBBLLL\nBFFBFFBRLL\nFBBFFFFRLL\nFFBFBFBLRR\nFBBBBFBLLL\nBFBFBFBRLR\nFBBFBBBLRL\nBFBFFBFRRL\nFBBFBFBLLL\nBFFFBFBLRL\nBBFFBFFLLL\nBBFFFBFLRL\nFFFBBBFRRL\nFBBFFFBLLL\nBFFFFFBLLR\nFBBBBFBRLL\nBFFFFBBRRR\nBFFFFBBLRL\nFBBFFBFRLR\nBBFFFFBRRR\nFBFFFFBLLL\nFFBFBFBRLR\nBFFFBBBLRL\nBFFFFFFRLL\nBFBFFBFLLR\nBBFFFBBRLR\nFBBBBFBLRL\nFBBBBFBRRR\nBFFBFFFLLL\nBFFBBBFRLL\nBFBFBBFRLR\nBBFFBFBRLR\nFBBBBBFLRR\nBFBBFBFRLR\nFFBBFBFRLR\nBFFFFFBRRR\nBFFBBFFLRL\nFBFFBFFRRL\nBFBBFFFLRL\nFBFFFBBLRL\nBFFFBFFRLR\nBFFFBFBRRL\nFBBBBBFLRL\nBBFFBBFLLL\nFFBBFBBLLL\nFFBFBFFLLL\nBBBFFFBLLL\nBFBFBBBLLR\nFBBFFBFLRL\nFBBBBFFRRR\nBFBBBBFLLR\nFFBFFFFRRR\nBBFFBBFLRL\nFBFBFBBRLR\nBFBBFFBLRL\nFBFBFFBLLL\nBBFFBFFLRL\nFBFBFFFLRR\nFFBFBFBLRL\nBFFBFBBRRR\nFFBFBBBRLR\nBFBBFFFRLR\nBFBFFFFRLR\nFFFBBFFLLL\nBFBFFFFLLL\nFFBFFBBRLR\nFFBFBFFLRR\nBFFBBFFRLL\nBBFFBBBLLR\nBFBBBBBRRL\nFBFBBBBRRR\nFBBFFFFRRR\nFFBBBFBRLR\nFFBFBFBLLL\nBFFBFFFLLR\nFBFBFBFRRR\nBFFBBBBLLL\nBFFFFBBRLR\nFBFBBFFLRL\nFFBFBFFLRL\nFBBBFFBLLR\nFBBFBFFLRL\nFFBFBBFLRL\nBBBFFFFRRL\nFFBBFBFLLL\nFFBBBBFRRL\nBBFFFFBLLL\nFFBBFBFRRR\nFBFFFFFLRR\nBFFBBBBRRL\nBFBBFBBRRL\nBBFBFBBRLR\nFFBFFFFLLL\nFBBFBFBLLR\nFBFBFFBLRL\nBBFBFBBRRR\nBFFBBFBLRL\nFFBBBFFLLL\nFBBBFFFLLL\nBFFFBFBLLR\nFFBBFFFLLL\nBFFBFFBLRR\nFFBBFFFLRR\nBFFBFBBRLL\nFFBFBFBLLR\nFBBBBBBLLR\nFBFFFFBRLR\nBFBBBFFRLL\nFFBBBBFRLR\nFFBFFBBLLR\nBBFFFFFLLR\nFBFFFBFRLR\nBFBFFFFRRL\nFBFFFBBLLL\nBBFFFBBLLL\nBFFBFBFLRL\nBBFFFBFRRL\nFBFFBBBRRR\nFBFFFBBLLR\nFFFBBFBRRL\nBBFBFFFLRL\nBFBFFFBRRL\nBFBBBFBRLR\nBFFFBBBLRR\nFBBFBFFLLR\nFBFBBBBRLR\nBBFBBBFRRL\nFFFBBFBRLR\nBFFBFFFLRL\nFBBBBBBRRL\nBFFBFFBLLL\nBFFBBFFRRL\nFBBFBBFLLR\nBFFBBBBLLR\nBFBBBFFLRL\nBFBFFBFRRR\nBBFFFBBRRL\nBFBFBFFLRL\nBFBBFFBRLL\nBFFFFFFLRR\nFFFBBBFLRR\nFBBFFFFLLL\nFFBBFFBRRL\nBFBFFBFLLL\nFBFBBBFLLR\nFFBBBBBRLR\nBBFBFFBRLL\nFBFBBFBRRL\nFBBFFBFLRR\nBFFFFFBRLR\nFBFBBFBLLR\nFBBBFFFLLR\nBFFFFBFRRL\nFBFFFFFRRL\nFBFBFFFRLR\nFBFBBBFLLL\nBBFBFFBLRR\nBFBBBFFRRL\nBFBBFBFRRR\nBBFFFFFRLL\nFBFBFBFRLR\nFBBBBBFRLL\nBBFFBFBLRL\nBBFFBBFRRL\nBFBFFFFLRR\nFBFFBBBRRL\nFFFBBFFRLR\nBBFFBFFRRL\nBBFBBFBLLR\nFBBFFBFLLR\nFBFFFFBLLR\nFFBFBFBRRL\nFBFFFFBLRR\nBFFBFFFRRR\nFFFBBBFRRR\nBFBFBFBLRR\nFBFBBBBLLR\nBBFFFFBLRL\nBFBBFBFLLL\nFBBBFFBLRL\nBBFBFFFRRL\nBBBFFFBRLL\nFBBFBBFLRR\nFBFBFFFLLL\nFBBFFFFRLR\nBFFBBBFRRL\nBBFFFBBRRR\nFBBBFFBRLR\nFFBFFFBRRL\nBFFFFFBLLL\nFBFFFBFRLL\nBBFFBFBRRR\nBFFFFBFLRR\nFFBBBBFLLR\nBFBFBBFLRR\nFBFBFBBLLL\nBFFFBFBLRR\nBBFBBFBRRR\nBFBBFBBLRL\nBBFBFBBLLL\nFBBBFBFLRL\nBFFFBBFRLL\nFBBBBBFRRL\nBFFBFFBRLR\nBFFBBBBLRR\nFFFBBFBLLL\nBFBBBBFLRL\nFBBBFBFLRR\nFBFFFBFLRR\nBFBFFFBRRR\nFBFFBFFLLR\nBFBFBFFRRR\nBFFBFBFRLR\nFBFFFFBRRL\nBFFFBFBRLL\nFBBBFBBLRR\nBFBBFFBRRR\nBFBFFFFRRR\nBFFBFBFRRR\nFFBBFFBLRL\nBFBBBBFLRR\nFBFFBBBLLR\nFBFBBFFLLR\nFBFFFBFRRR\nFBFBBBBLLL\nBFBBFBBLRR\nBFBFFFBLRL\nBFFBBFBLLL\nFBFFBBFLLR\nBBFBFFFLLR\nBBFFFFFRRL\nFBFBBFFRRR\nBFFFBFFLRL\nFBFBFBFLLR\nBFFFFFFRLR\nFFBBBBFRRR\nBBFBFBFLRL\nFBBBFFBRRR\nFBFFBFFRRR\nFBBBBFBLLR\nBBBFFFBLLR\nFBFFBFBRRL\nFBBBFBBRLR\nFBFFBBFRLL\nBBBFFFBLRR\nBFFFBBFLLR\nFBFFBFFRLL\nFFBBBBFLLL\nFFBBBFBRRR\nBBFBBFFRLR\nFBBBFBBLLR\nFBBFBFFRRR\nBFBBFBFRLL\nFFFBBBBRRL\nFBFBFFBRRL"
          )
        ) should be(911)
      }
    }

    "findMissingSeat" should {
      "find the missing seat id" in {
        BinaryBoarding.findMissingSeat(
          InputParser.parse[String](
            "BFBBFFFLRR\nFFBFBBBLLL\nFBFBFBFLLL\nBBFFFBFLLR\nFBFFBBFLRR\nBBFBFFFLLL\nFFBBFFFRLL\nBFBFBBBRRR\nFBFFBFFRLR\nFBBBBBBLLL\nBBFBBBBLLL\nBFFFBBBLLL\nFFBFFFBRLR\nBFFFFBFLLR\nFFBBBFBLRL\nBFFBFBBRRL\nFBFBFBBRRR\nFBFFFBBRRL\nFBFBBBFRLR\nBFFFFFBRRL\nBBFFFBBLRR\nFFBBBBBRRR\nFFBBBBBLLL\nBBFBFFBRLR\nFBFFBFBRRR\nFFFBBBBRLL\nBBFBFFBLLR\nBFBFFFBRLL\nFFBFBFFLLR\nFBFBBFBRLL\nFBFFBBBLLL\nFBFBBBFRLL\nFBFBFBBRLL\nBFFFFBBRLL\nFFFBBFFLLR\nFFBFFFBLRL\nFFBFBBFLLL\nBFBBFBBLLL\nBFFFFBBRRL\nFFBFFFBRLL\nBFBBFFFRRR\nFFBBFFFLRL\nFFBFBFBRLL\nBFBFBBBLLL\nBBFBBFFLRL\nBFFFFBBLLR\nFFBFBBFRLR\nFFBBFBBLLR\nFBFFBBFLLL\nBFBFBFBLLL\nBFFBFBBLLR\nFBBBBFFRLR\nFBBBFBFRLL\nFBBBBFFLRR\nBFFBBBBLRL\nFBFFBBFLRL\nBBFFFBBLLR\nFBFBFFFRLL\nFBBBFBBRRL\nFFBBBFBLLR\nBFFBBBFLLR\nBFFFFBFRLR\nBBFFFFBLLR\nFBBFFFBRRL\nBFFFBFBRRR\nFBFBFFFRRR\nBBBFFFBLRL\nBFBFBFBLLR\nBFBBBBBLRL\nFFBBFBBRRR\nFBBFFFBRRR\nFFBFBFBRRR\nBBFFFFBRRL\nBFBBBBBLLL\nBFBFBFFRLL\nBFBFBFBRRL\nBFBFFFFLRL\nFFBBBBBLLR\nFBBFBFFRLL\nFBBFFBBLLL\nBFFFFFFLRL\nFFFBBFFLRL\nFFFBBFFRLL\nFFBFFFBLLL\nFBBFBFBLRL\nBBFFFFBRLR\nFBBFBBBRLR\nFFBBFFBLLL\nFFBFFFBRRR\nFBFBFBFRRL\nFFBBBFBRRL\nBBFFBFFLRR\nFBFFFFFRRR\nFBBFFFBRLL\nFFBBFBBRRL\nFFBBFFFLLR\nFBFBBFBLLL\nBFFFBBFLRR\nBFBFBFFLRR\nBFFFFBFRRR\nBBFBBFFRLL\nBFBBBBBLRR\nBFBBBBFLLL\nBBFBBBBLLR\nFFBBBFFRRR\nBBFFBFBLRR\nFFFBBBFRLR\nBFBFFFBLRR\nBFFFBBFLLL\nFBBBBFFLRL\nFBBFFFFRRL\nFFBFFBBRRL\nBFBBBBBRLR\nFBBFFBBLRL\nBBFBFBBRLL\nFBFFBFBRLR\nFBBBBFFLLR\nFBBFBBFRRL\nFBFBBBBRLL\nBFFBFBFRLL\nFFBFBBFRRL\nFBFFFBFRRL\nFBFFBBFRRL\nFFBFBBFRLL\nBBFBBBBLRL\nBFFFBBBRRL\nFFBFFFBLRR\nFFBBFBBLRL\nBFBFBBFRRR\nBFFFFFFRRL\nFBBBBBBRRR\nFBFBBFBLRR\nFBFFFFFRLR\nBFFBBBFLRR\nBFBBFFBLLL\nFBFFFFBLRL\nFFBBBBBLRL\nFFFBBBFRLL\nFFBBFBFRLL\nFBFBBBFLRL\nFFBBBFBRLL\nBBFBBFBLRL\nFFBFBFFRLR\nBBFBBBBLRR\nFFFBBBBRRR\nFBBBFBFLLL\nBFFFBFBRLR\nFBBFBBFRRR\nFBFFBBBRLR\nFBFBBFBRLR\nFBBBFBBLLL\nBBFBFBFLLL\nFFBBFBBRLL\nFBBFBBBLRR\nBFFFBBFRRL\nBFBFFBFLRR\nBBFBBBFLLL\nBFFFBBFRLR\nBFBBFBFLRL\nFBBBBBFRRR\nFBFFFBBRRR\nBBFFFFBLRR\nFBFBFBFLRL\nBBFFBBBRLL\nFFBBBFFLRR\nFFBBBBFLRR\nFBFBFBBRRL\nBBFBFFBRRL\nFBBBFFBLLL\nBFBFFFFLLR\nFFBFFBFLRR\nBFBBFFFLLR\nBBFBBFFLRR\nBFFFFFFLLR\nBBFFBFBRRL\nFBBBFBBRLL\nBFBBBFBLLR\nBFBBFFBRLR\nFBFBBBFRRR\nBFBBBBBRRR\nFFBBFBBRLR\nFBBFBBFRLR\nBFFBBFBRLR\nFBFFFFFLLL\nFBBFFBFRLL\nFBBBBFFRRL\nFBFBBBBLRL\nFFFBBFBLRR\nFFBFFBBLRR\nFFBBBBBLRR\nFBBFFBFRRR\nFBBBFBFRRR\nFBBFBBBLLR\nBFFFFBFLLL\nFFBFFFFRRL\nBFBFFBBLRL\nFFBFFFFRLR\nFBFBFBFRLL\nBBFBFBBRRL\nFFBFBBFLLR\nBFBBFFBLLR\nFBFFBFFLLL\nBFFBBFBRRR\nFBFFFBBRLL\nBBFBBFFRRR\nFBFBBFBLRL\nFBFBFBBLRL\nFBFFBBFRRR\nFBFFBBBLRL\nFFBFBBBRRR\nBFBBBFFLLR\nFFBBFFFRRL\nFFBBBBBRRL\nFFBFFBBRLL\nFFBBFBFLLR\nFBBBFBFLLR\nBFFFBFFRLL\nFFBBBFBLRR\nBFFBBBFRRR\nBFBBFBBRRR\nBBFBFFFRRR\nFBBFFFBLRL\nBBFBBBFLLR\nBBFFFBBLRL\nFBBFFFFLRR\nBFFBFFFRRL\nFFBFBBBRLL\nBBFBBFBRLL\nFBFFFBBLRR\nBFBFBBFRLL\nFBFBBBBRRL\nFFFBBBFLLR\nFBFFFFBRRR\nFBBBBBBRLR\nBBFBFBFRRR\nBFBFFBFRLL\nBFBBBFFLLL\nBFBBBFBLLL\nFBFFBFBLRL\nFFBFFFFLLR\nFBBBBBFLLL\nBBFFBFBLLR\nBBFBBBFLRR\nBFFFFFFRRR\nBFFBFFBRRR\nBFFBBFFLLL\nFFFBBBFLLL\nBFFBBFFRRR\nBBFBBBBRRL\nFBFBBFFLRR\nBFBFFBBLLR\nBFBFFBBRRL\nBFBBFFFLLL\nBFBFFBBRRR\nBFBBFBFRRL\nFBFBFFFLLR\nBFBFBFFLLR\nBFBBBBFRRL\nBFFFBFFLRR\nFBBFBBBRRL\nBBFFFBBRLL\nFFBFBBBLRR\nFFBBFFBRLL\nFBBBFBFRRL\nFFBFFFFLRL\nBFFFBBBRLL\nBFBBBFFRRR\nFFBFFBBRRR\nBFBFFFBLLR\nFBFFFBFLLR\nFBFBBFFRRL\nFFBFFBBLLL\nBBFBBBFLRL\nBFBFBBFRRL\nBFFFBFFLLL\nFBBBFFFRLL\nBBBFFFFLLR\nBFFBFFBLRL\nBBFFBBBLLL\nBFFBFFBLLR\nBBFFBBBLRL\nFBBFFBBLLR\nFFBFBBFRRR\nFBFBBFBRRR\nBFBFFBFRLR\nBFBBBFBRLL\nFFBBBBFLRL\nBFFBFBFLLR\nBFBBFFFRLL\nBBFBFBBLRR\nFBBFBFFLLL\nFBBFFFFLRL\nFBBBBFBRRL\nFFBBBFFRLL\nFBBFBFFRRL\nFBBBFBFRLR\nFBBBFFBLRR\nBBFFBBBLRR\nFBBFFBFLLL\nFBFBBFFRLL\nFFBFBFFRLL\nBFBFBBBRRL\nFBFBBBFRRL\nFFBFBBBLLR\nBFFBFFFRLR\nFFBFBFFRRL\nBBFFFFFLRL\nFBFFBFFLRL\nBBFFFBFLLL\nBFFBBFBLRR\nBFBBFBFLLR\nFBFBFBFLRR\nBBFFBBFRLL\nBBFBFBFRLL\nBBFFFBFRLR\nBFFBFBFRRL\nBFFBFBBLRL\nFFFBBBFLRL\nFBBBFFFRRL\nFFBFBBFLRR\nFBBFBFBRLR\nFFFBBFFRRR\nFBBBBBBLRL\nBBFFBBFRRR\nFFBFFBFLLL\nBFFFBBFLRL\nFBFBBBFLRR\nBBFFBFBLLL\nFBFFBBFRLR\nBFFBFBBLLL\nBFBBFFBLRR\nFFBBBFFLLR\nFBFBFFFRRL\nBFBBFBBRLL\nBBFBBFBLRR\nFBBFFFFLLR\nBFFFBBFRRR\nBBFFFBFRRR\nBBFBBFFLLL\nBBFFBFBRLL\nBBBFFFFRLR\nBFFFFBFRLL\nFFBBBFFRRL\nBFFBBBFLRL\nBBFBBBFRLL\nFBFFFFBRLL\nBFBFFBFLRL\nFFBFFBBLRL\nFBBBBBBLRR\nBBFFFBFRLL\nBFBFFBBRLR\nBBFBFFBLLL\nBFFFBFFRRR\nFFBFFBFLRL\nFBBFBFFLRR\nBBFBFFBRRR\nBBFBFFBLRL\nFBBBBFBLRR\nBBFFBBBRRR\nBBFFBFFLLR\nFBBBFFBRLL\nBFBFFBBLLL\nFBBFBBBLLL\nFFBBFBBLRR\nFBBBBFFLLL\nBFBFBBFLRL\nBFBBBFBRRL\nBFBBBBFRLL\nFFBBFFFRLR\nBBFBBBFRLR\nBFBBFBBRLR\nFFFBBBBLLL\nBFFFFFBLRL\nFBFBFFBRLL\nFBBFBBBRLL\nFBBFBBFRLL\nBFBFBBFLLR\nFFBBFBFLRL\nFBBBFFBRRL\nFFBFFBFRRR\nBBFFFFBRLL\nFBBFFBFRRL\nBBFFFFFRLR\nFBFBFFBLRR\nBFFBBFBRLL\nBBFFFFFLRR\nBBFFBBBRRL\nBBFFBFFRLR\nFFBBFFBLLR\nFBBFFFBLRR\nBFFBBBBRLL\nFBFBFBBLRR\nFBBFBFBRLL\nFBBBFFFRRR\nFBBFFBBRLL\nFFBFFFFRLL\nFFBBBFBLLL\nFBFFBBBLRR\nFFBBFFBRRR\nFFFBBFBRRR\nFBFBFFBRRR\nFFBFFBFRLR\nBFFFFFFLLL\nFFBFFBFRRL\nBFBFBFFLLL\nBFFBBBBRRR\nBFFBBFBRRL\nBBFFBBBRLR\nBBFFBFFRRR\nBBFBFBFRLR\nFFBBFBFLRR\nFBFFBFBLRR\nBBFBBBBRLL\nBBFFFFFLLL\nFBFFBFFLRR\nBBBFFFBRRL\nBFFBFFBRRL\nBFBBBFBRRR\nFFFBBFBRLL\nBFFBBFBLLR\nBFBBBBFRLR\nBFFFFBFLRL\nFBBFBFBRRR\nBFFBFBBLRR\nBBFBBFBLLL\nFBFBFFBRLR\nFFBBBBFRLL\nBFBFFBBRLL\nBBFBBBBRLR\nFFFBBBBLRL\nFFFBBFBLLR\nBFBBFBFLRR\nFFFBBFBLRL\nFBBBBBFLLR\nFBFFBFBRLL\nBFBFBBBRLL\nBFBBBBFRRR\nFBBFBFBRRL\nBBFFBBFRLR\nFFFBBBBRLR\nBFBFBBBLRR\nFBBBBFBRLR\nBBFBFBBLRL\nFFBBBFFRLR\nBFBBBFFLRR\nFBFBBBBLRR\nFBBFFFBRLR\nBFFFFFBLRR\nBFFBBBBRLR\nFBBBFFFRLR\nBBBFFFFLRR\nBFBFBFBRRR\nFFBFFBFRLL\nBBFBFBFLRR\nBFBBFBBLLR\nFFBBBBBRLL\nFFFBBBBLRR\nFBBFBBFLRL\nBFFFBFBLLL\nBFBFFFFRLL\nFBFFFBFLRL\nBBFFFFFRRR\nFBBFBBFLLL\nFBBFBFFRLR\nFFFBBFFLRR\nBFBBFFFRRL\nFBFFFBBRLR\nBBFBFFFRLL\nFBBFFBBRRL\nBBBFFFFRLL\nBFBBBBBRLL\nFFFBBFFRRL\nFBBFFFBLLR\nBFFFBFFLLR\nFFBFFBFLLR\nFBBFFBBRRR\nBFFFFFBRLL\nBFFFBFFRRL\nBBFBBBFRRR\nBFFBFBFLRR\nFBFBBFFRLR\nBBFFFBFLRR\nBBFBFBFLLR\nBFFBBBFLLL\nFBFBFBBLLR\nFBBBBBBRLL\nFBFBFFFLRL\nFFBBFFBRLR\nBBFBBFBRRL\nBBFBBFBRLR\nBFFBBFFLRR\nBFFBFFFLRR\nBFBFBFFRRL\nBBFBBBBRRR\nFBFFFFFLLR\nBBFFBBFLLR\nBFFFBBBRLR\nFBBBBFFRLL\nBBFBBFFRRL\nBBFFBFFRLL\nBFBFBFBLRL\nBFBFFFBLLL\nBBFBFFFRLR\nFBBBFFFLRL\nFFFBBBBLLR\nFFBFFFFLRR\nBBFBFBFRRL\nFBFFBBBRLL\nFBBBFBBLRL\nBBBFFFFLLL\nFFBFBBBRRL\nFBFBFFBLLR\nFBFFFFFLRL\nBFBFBBBLRL\nBFFBBFFRLR\nBFBFFBBLRR\nBFFBFBBRLR\nFBBFBFBLRR\nFFBBBFFLRL\nBBFFBBFLRR\nFBBBFBBRRR\nBFFFBBBLLR\nBFBFBBBRLR\nBFFBFBFLLL\nBBBFFFBRRR\nBBBFFFBRLR\nFBFBBFFLLL\nBFFBBFFLLR\nFFBBFFBLRR\nFBBBBBFRLR\nBFBBFFBRRL\nFBBBFFFLRR\nFBFFFFFRLL\nFFBFFFBLLR\nBFFBFFFRLL\nBFBFBFBRLL\nBFFFFBBLRR\nFBBFFBBLRR\nBFBBBFBLRL\nBBFBFBBLLR\nBFBBBFBLRR\nFBFFFBFLLL\nBFBBBBBLLR\nBFBFFFBRLR\nBFBFBBFLLL\nBBBFFFFRRR\nFBBFFBBRLR\nBBBFFFFLRL\nFBBFBBBRRR\nFFBBFBFRRL\nBFFFBBBRRR\nFFBFBFFRRR\nBBFBFFFLRR\nFFBFBBBLRL\nBFBFBFFRLR\nFFBBFFFRRR\nFBFFBFBLLL\nFBFFBFBLLR\nBBFBBFFLLR\nBFBBBFFRLR\nBFFFFBBLLL\nBFFBFFBRLL\nFBBFFFFRLL\nFFBFBFBLRR\nFBBBBFBLLL\nBFBFBFBRLR\nFBBFBBBLRL\nBFBFFBFRRL\nFBBFBFBLLL\nBFFFBFBLRL\nBBFFBFFLLL\nBBFFFBFLRL\nFFFBBBFRRL\nFBBFFFBLLL\nBFFFFFBLLR\nFBBBBFBRLL\nBFFFFBBRRR\nBFFFFBBLRL\nFBBFFBFRLR\nBBFFFFBRRR\nFBFFFFBLLL\nFFBFBFBRLR\nBFFFBBBLRL\nBFFFFFFRLL\nBFBFFBFLLR\nBBFFFBBRLR\nFBBBBFBLRL\nFBBBBFBRRR\nBFFBFFFLLL\nBFFBBBFRLL\nBFBFBBFRLR\nBBFFBFBRLR\nFBBBBBFLRR\nBFBBFBFRLR\nFFBBFBFRLR\nBFFFFFBRRR\nBFFBBFFLRL\nFBFFBFFRRL\nBFBBFFFLRL\nFBFFFBBLRL\nBFFFBFFRLR\nBFFFBFBRRL\nFBBBBBFLRL\nBBFFBBFLLL\nFFBBFBBLLL\nFFBFBFFLLL\nBBBFFFBLLL\nBFBFBBBLLR\nFBBFFBFLRL\nFBBBBFFRRR\nBFBBBBFLLR\nFFBFFFFRRR\nBBFFBBFLRL\nFBFBFBBRLR\nBFBBFFBLRL\nFBFBFFBLLL\nBBFFBFFLRL\nFBFBFFFLRR\nFFBFBFBLRL\nBFFBFBBRRR\nFFBFBBBRLR\nBFBBFFFRLR\nBFBFFFFRLR\nFFFBBFFLLL\nBFBFFFFLLL\nFFBFFBBRLR\nFFBFBFFLRR\nBFFBBFFRLL\nBBFFBBBLLR\nBFBBBBBRRL\nFBFBBBBRRR\nFBBFFFFRRR\nFFBBBFBRLR\nFFBFBFBLLL\nBFFBFFFLLR\nFBFBFBFRRR\nBFFBBBBLLL\nBFFFFBBRLR\nFBFBBFFLRL\nFFBFBFFLRL\nFBBBFFBLLR\nFBBFBFFLRL\nFFBFBBFLRL\nBBBFFFFRRL\nFFBBFBFLLL\nFFBBBBFRRL\nBBFFFFBLLL\nFFBBFBFRRR\nFBFFFFFLRR\nBFFBBBBRRL\nBFBBFBBRRL\nBBFBFBBRLR\nFFBFFFFLLL\nFBBFBFBLLR\nFBFBFFBLRL\nBBFBFBBRRR\nBFFBBFBLRL\nFFBBBFFLLL\nFBBBFFFLLL\nBFFFBFBLLR\nFFBBFFFLLL\nBFFBFFBLRR\nFFBBFFFLRR\nBFFBFBBRLL\nFFBFBFBLLR\nFBBBBBBLLR\nFBFFFFBRLR\nBFBBBFFRLL\nFFBBBBFRLR\nFFBFFBBLLR\nBBFFFFFLLR\nFBFFFBFRLR\nBFBFFFFRRL\nFBFFFBBLLL\nBBFFFBBLLL\nBFFBFBFLRL\nBBFFFBFRRL\nFBFFBBBRRR\nFBFFFBBLLR\nFFFBBFBRRL\nBBFBFFFLRL\nBFBFFFBRRL\nBFBBBFBRLR\nBFFFBBBLRR\nFBBFBFFLLR\nFBFBBBBRLR\nBBFBBBFRRL\nFFFBBFBRLR\nBFFBFFFLRL\nFBBBBBBRRL\nBFFBFFBLLL\nBFFBBFFRRL\nFBBFBBFLLR\nBFFBBBBLLR\nBFBBBFFLRL\nBFBFFBFRRR\nBBFFFBBRRL\nBFBFBFFLRL\nBFBBFFBRLL\nBFFFFFFLRR\nFFFBBBFLRR\nFBBFFFFLLL\nFFBBFFBRRL\nBFBFFBFLLL\nFBFBBBFLLR\nFFBBBBBRLR\nBBFBFFBRLL\nFBFBBFBRRL\nFBBFFBFLRR\nBFFFFFBRLR\nFBFBBFBLLR\nFBBBFFFLLR\nBFFFFBFRRL\nFBFFFFFRRL\nFBFBFFFRLR\nFBFBBBFLLL\nBBFBFFBLRR\nBFBBBFFRRL\nBFBBFBFRRR\nBBFFFFFRLL\nFBFBFBFRLR\nFBBBBBFRLL\nBBFFBFBLRL\nBBFFBBFRRL\nBFBFFFFLRR\nFBFFBBBRRL\nFFFBBFFRLR\nBBFFBFFRRL\nBBFBBFBLLR\nFBBFFBFLLR\nFBFFFFBLLR\nFFBFBFBRRL\nFBFFFFBLRR\nBFFBFFFRRR\nFFFBBBFRRR\nBFBFBFBLRR\nFBFBBBBLLR\nBBFFFFBLRL\nBFBBFBFLLL\nFBBBFFBLRL\nBBFBFFFRRL\nBBBFFFBRLL\nFBBFBBFLRR\nFBFBFFFLLL\nFBBFFFFRLR\nBFFBBBFRRL\nBBFFFBBRRR\nFBBBFFBRLR\nFFBFFFBRRL\nBFFFFFBLLL\nFBFFFBFRLL\nBBFFBFBRRR\nBFFFFBFLRR\nFFBBBBFLLR\nBFBFBBFLRR\nFBFBFBBLLL\nBFFFBFBLRR\nBBFBBFBRRR\nBFBBFBBLRL\nBBFBFBBLLL\nFBBBFBFLRL\nBFFFBBFRLL\nFBBBBBFRRL\nBFFBFFBRLR\nBFFBBBBLRR\nFFFBBFBLLL\nBFBBBBFLRL\nFBBBFBFLRR\nFBFFFBFLRR\nBFBFFFBRRR\nFBFFBFFLLR\nBFBFBFFRRR\nBFFBFBFRLR\nFBFFFFBRRL\nBFFFBFBRLL\nFBBBFBBLRR\nBFBBFFBRRR\nBFBFFFFRRR\nBFFBFBFRRR\nFFBBFFBLRL\nBFBBBBFLRR\nFBFFBBBLLR\nFBFBBFFLLR\nFBFFFBFRRR\nFBFBBBBLLL\nBFBBFBBLRR\nBFBFFFBLRL\nBFFBBFBLLL\nFBFFBBFLLR\nBBFBFFFLLR\nBBFFFFFRRL\nFBFBBFFRRR\nBFFFBFFLRL\nFBFBFBFLLR\nBFFFFFFRLR\nFFBBBBFRRR\nBBFBFBFLRL\nFBBBFFBRRR\nFBFFBFFRRR\nFBBBBFBLLR\nBBBFFFBLLR\nFBFFBFBRRL\nFBBBFBBRLR\nFBFFBBFRLL\nBBBFFFBLRR\nBFFFBBFLLR\nFBFFBFFRLL\nFFBBBBFLLL\nFFBBBFBRRR\nBBFBBFFRLR\nFBBBFBBLLR\nFBBFBFFRRR\nBFBBFBFRLL\nFFFBBBBRRL\nFBFBFFBRRL"
          )
        ) should be(629)
      }
    }
  }
}
