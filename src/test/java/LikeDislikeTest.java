import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LikeDislikeTest {
//LIKE ,LIKE = NEUTRAL
    //DISLIKE/DISLIKE is NEUTRAL
    //DISLIKE/DISLIKE/LIKE is LIKE
    //LIKE/DISLIKE is NEUTRAL
    //LIKE/LIKE/LIKE/DISLIKE/DISLIKE/DISLIKE is NEUTRAL
    //No response/empty array would be NEUTRAL
    @Test
    @DisplayName("Test to check response from an array of String responses")
    void checkResponse() {
        LikeDislike responses = new LikeDislike();

        String[] noResponse = {};
        String[] nullResponse = null;
        String[] oneResponse = {"LIKE"};
        String[] twoResponse = {"LIKE","LIKE"};
        String[] twoDiffResponse = {"DISLIKE","LIKE"};
        String[] threeResponse = {"LIKE","LIKE","LIKE"};
        String[] threeDiffResponse = {"DISLIKE","LIKE","LIKE"};
        String[] sixResponse = {"LIKE","LIKE","LIKE","DISLIKE","DISLIKE","DISLIKE"};

        var noResponseResult = responses.checkResponse(noResponse);
        var nullResponseResult = responses.checkResponse(nullResponse);
        var oneResponseResult = responses.checkResponse(oneResponse);
        var twoResponseResult = responses.checkResponse(twoResponse);
        var twoDiffResponseResult = responses.checkResponse(twoDiffResponse);
        var threeResponseResult = responses.checkResponse(threeResponse);
        var threeDiffResponseResult = responses.checkResponse(threeDiffResponse);
        var sixResponseResult = responses.checkResponse(sixResponse);

        assertAll(
                ()-> assertEquals("NEUTRAL",noResponseResult),
                ()-> assertEquals("NULL",nullResponseResult),
                ()-> assertEquals("LIKE",oneResponseResult),
                ()-> assertEquals("NEUTRAL",twoResponseResult),
                ()-> assertEquals("NEUTRAL",twoDiffResponseResult),
                ()-> assertEquals("LIKE",threeResponseResult),
                ()-> assertEquals("DISLIKE",threeDiffResponseResult),
                ()-> assertEquals("NEUTRAL",sixResponseResult)
        );

    }
}