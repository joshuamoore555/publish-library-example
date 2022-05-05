import com.github.joshuamoore555.util.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {
  @Test
  void
      givenAString_whenSplittingWithAValidCharacter_andChoosingAValidIndex_ThenReturnAValidResponse() {
    String example = "hello world";
    String expectedResponse = "hello";
    assertEquals(expectedResponse, StringUtils.getPartOfString(example, " ", 0));
  }

  @Test
  void
      givenAString_whenSplittingWithAValidCharacter_andChoosingAInvalidIndex_ThenReturnAnEmptyResponse() {
    String example = "hello world";
    String expectedResponse = "";
    assertEquals(expectedResponse, StringUtils.getPartOfString(example, " ", 99));
  }

  @Test
  void
      givenAString_whenSplittingWithAnInvalidCharacter_andChoosingAValidIndex_ThenReturnAnEmptyResponse() {
    String example = "hello world";
    String expectedResponse = "";
    assertEquals(expectedResponse, StringUtils.getPartOfString(example, "notvalid", 0));
  }
}
