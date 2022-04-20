import java.text.Normalizer
import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`);
    println("Saisir une phrase : ")
    val phrase = sc.nextLine().trim().unaccent()
        .replace(" ", "")
        .replace(",", "")
        .replace("'", "");
    println(phrase);

    val phraseReverse = phrase.reversed();
    println(phraseReverse);

    if (phrase.equals(phraseReverse, ignoreCase = true)) {
        println("Palindrome")
    }else{
        println("Pas palindrome")
    }
        /* var reverseString = "";
         var lenght = mot.length;

         for (i in (lenght - 1) downTo 0) {
             reverseString = reverseString + mot[i];
         }

         if (mot.equals(reverseString, ignoreCase = true)) {
             println("Palindrome")
         } else {
             println("Pas palindrome")
         }*/
}

private val REGEX_UNACCENT = "\\p{InCombiningDiacriticalMarks}+".toRegex()
fun CharSequence.unaccent(): String {
    val temp = Normalizer.normalize(this, Normalizer.Form.NFD)
    return REGEX_UNACCENT.replace(temp, "")
}