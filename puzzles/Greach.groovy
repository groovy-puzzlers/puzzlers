class Conference {def name; def year}

def gr = new Conference(name: 'Greach', year: 2014)

gr.each {println it}


//A:  class=class Conference
//    name=Greach
//    year=2014

//B: Conference@68567e20

//C: Startup failure

//D:  Greach
//    2014