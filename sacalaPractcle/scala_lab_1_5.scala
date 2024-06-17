object scala_lab_1_5{
      def main(args:Array[String]): Unit = {
           //distances
           val easyPaceDistance1 = 2
           val tempoDistance = 3
           val easyPaceDistance2 = 2
           //paces in per minute
           val easyPace = 8
           val tempo = 7
           val total = total_time(easyPaceDistance1,tempoDistance,easyPaceDistance2,easyPace,tempo)
           println(s"The total running time is $total minutes")}
       def total_time(easyPaceDistance1: Int,tempoDistance : Int,easyPaceDistance2: Int,easyPace: Int,tempo: Int):Int ={
           val easypacetime1 = easyPaceDistance1*easyPace
           val tempotime = tempoDistance*tempo
           val easypacetime2 = easyPaceDistance2*easyPace
           easypacetime1 + easypacetime2 + tempotime
}
}
