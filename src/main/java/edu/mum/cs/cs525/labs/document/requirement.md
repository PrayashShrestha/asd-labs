let's say we have to implement different functanilaties to the word document (Object Structure).
- The word document has image, text and hyperlinks
- Suppose we have to implement methods like Spell-check, Word-count.
- Implement those operations using visitor pattern


---
*To implement this:*
- Make visitor Interface. Implement concrete Visitor (SpellCheck and WordCounter).
- Make the Element Interface with accept method. Implement concrete Element to (PlainText, Image, Hyperlink).
- Here Document is the ObjectStructure.