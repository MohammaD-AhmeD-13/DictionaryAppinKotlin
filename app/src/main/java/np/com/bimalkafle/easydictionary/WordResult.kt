package np.com.bimalkafle.easydictionary
//wordresult class
data class WordResult(
    val word: String,
    val phonetic: String?,
    val meanings: List<Meaning>,
)
// meaing class
data class Meaning(
    val partOfSpeech: String,
    val definitions: List<Definition>,
    val synonyms: List<String>,
    val antonyms: List<String>,
)
// definition class
data class Definition(
    val definition: String
)
