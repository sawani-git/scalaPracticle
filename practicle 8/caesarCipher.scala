object caesarCipher{
     def encrypt(text: String,shift: Int): String = {
       text.map { char =>
         if (char.isLetter){
            val shiftAmount = if (char.isUpper) 'A' else 'a'
            ((char + shift - shiftAmount)% 26 + shiftAmount).toChar
         } else {
            // if the character is not a letter,keep it unchanged
           char
         }
       }
    }
     def decrypt(text: String,shift:Int): String={
       encrypt(text,-shift)
    }
     
     def cipher(text: String,shift:Int,func:(String,Int)=> String):String={
       func(text,shift)
    }
     def main(args: Array[String]): Unit = {
       val text= "HELLO WORLD"
       val shift= 3
      
       val encrypted = cipher(text,shift,encrypt)
       println(s"Encrypted: $encrypted")
        
       val decrypted = cipher(encrypted,shift,decrypt)
       println(s"Decrypted: $decrypted")
    }
  }       





