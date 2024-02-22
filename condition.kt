fun  main(){
    //while condition
    var i = 0
    while (i<=5){
        println(i)
        i++
    }

    //do  while loop
    var r = 0
    do{
        println(r)
        r++
    }while (r<=5)

    var p = 0
    while (p<=20){
        if (p==10){
            break
        }
        println(p)
        p++

    }

    var t=20
    while (t<=30){
        if(t==25){
            t++
            continue
        }
        println(t)
        t++
    }
}