package stackoverflow.q34390175

object StringUtils{
  def isEmpty(s: String) = true
}

object aoc4Xml{
  def \\(s: String) = {
    new {def text = "test"}
  }
}

object DateUtils{
  def getDateFromFormatOfString(s: String) = 0
}

object Main {
  val date = "date"
  def addErrorStringFromString(s: String) = println(s)
  object aoc4Dto{
    var finYearStartDate = 0
    var finYearEndDate = 0
  }

  def parseDates: Boolean = {
    var date = (aoc4Xml \\ "FinancialStmtFromDate" text)
    if (StringUtils.isEmpty(date)) {
      addErrorStringFromString("Please enter the financial year start date")
      return false
    }
    aoc4Dto.finYearStartDate = DateUtils.getDateFromFormatOfString(date)

    date = (aoc4Xml \\ "FinancialStmtToDate" text)
    if (StringUtils.isEmpty(date)) {
      addErrorStringFromString("Please enter the financial year end date")
      return false
    }
    aoc4Dto.finYearEndDate = DateUtils.getDateFromFormatOfString(date)

    true
  }
}
