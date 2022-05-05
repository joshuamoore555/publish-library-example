package com.github.joshuamoore555.util;

public final class StringUtils {

  private static final String EMPTY_STRING = "";

  StringUtils() {}
  /**
   * Returns a new {@code String} from a given string that is split. If the index to split by is
   * invalid, or the value to split by is not present, then an empty string is returned.
   *
   * @param valueToSplit The string to be split
   * @param valueToSplitBy The value we want to split the string by
   * @param index The index of the string we want to return
   */
  public static String getPartOfString(String valueToSplit, String valueToSplitBy, int index) {
    if (valueToSplit.contains(valueToSplitBy)) {
      var valueParts = valueToSplit.split(valueToSplitBy);
      return valueParts.length > index ? valueParts[index] : EMPTY_STRING;
    } else {
      return EMPTY_STRING;
    }
  }
}
