package domain.common.demographics

/**
 * Created by hashcode on 2015/11/07.
 */
import play.api.libs.json.Json

case class LanguageProficiency(languageProficiencyId:String,name:String)

object LanguageProficiency{
  implicit val lanPFmt = Json.format[LanguageProficiency]
}
