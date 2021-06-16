import org.junit.Assert;
import org.junit.Test;

public class Anagram_Test {

    Anagram anagram = new Anagram();
    @Test
     public void comparisonOfTwoWords_correct() {
        //Anagram anagram = new Anagram();
        Assert.assertEquals(true, anagram.czyAnagramy("ale", "ela"));
    }
    @Test
        public void comparisonOfTwoWords_incorrect() {

            Assert.assertEquals(false, anagram.czyAnagramy("alex", "ela"));
        }
}
