def mul={x,y-> x*y}

println mul(2,3)

def triple = mul.curry(3)

//assert triple(2)== 6

println  triple(7)