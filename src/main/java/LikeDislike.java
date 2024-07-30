public class LikeDislike {
public enum response {
    LIKE,
    DISLIKE,
    NEUTRAL
}
    public String checkResponse(String[] responses) {
        int countLike = 0;
        int countDislike = 0;

        if (responses == null) {
            return "NULL";
        }
        if (responses.length != 0) {
            if ((responses.length % 2 != 0)) {
                for (String response : responses) {
                    if (response.equalsIgnoreCase("LIKE")) {
                        countLike++;
                    } else {
                        countDislike++;
                    }
                }
                if ((countLike % 2 != 0) && (countLike > countDislike)) {
                    return "LIKE";
                } else {
                    return "DISLIKE";
                }
            } else {
                return "NEUTRAL";
            }
        }
        return "NEUTRAL";
    }}

