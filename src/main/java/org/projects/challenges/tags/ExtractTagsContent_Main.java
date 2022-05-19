package org.projects.challenges.tags;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.

Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.

Tags can consist of any printable characters.
*/
public class ExtractTagsContent_Main {

    public static void main(String[] args) {
        String line = "<a1><b1>texto b1</b1><c1>texto c1</c1></a1>";

        int testCases = 1;
        //todo: the regex initial section "<(.+)>" corresponds to the opening tag (Example: <a1>).
        // The section "\\1" refers to the first group occurrence "(.+)"  (Example: a1)

        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(line);

        while (m.find()) {
            System.out.println(m.group(2));
        }
    }

}
