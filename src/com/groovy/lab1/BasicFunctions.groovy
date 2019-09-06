def list = [1,2,3]

println list.collect{it+3}


def mapOfValues = [1: 'a', 2: "b", 3: "c"]
def collectionOfValues = mapOfValues.collect{k,v -> "$k:$v"}

println collectionOfValues

def joinedCollectionOfValues = collectionOfValues.join(',')
println joinedCollectionOfValues