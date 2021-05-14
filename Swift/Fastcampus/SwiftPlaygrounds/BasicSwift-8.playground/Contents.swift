import UIKit

var scoreDic: [String: Int] = ["Jason": 80, "Jay": 95, "Jake": 90]
var scoreDic2: Dictionary<String, Int> = ["Jason": 80, "Jay": 95, "Jake": 90]

scoreDic["Jason"]
scoreDic["Jay"]

scoreDic["Jerry"]

// 위는 optional 상황이므로
if let score = scoreDic["Jason"]{
    print(score)
}
else{
    print("None")
}

// empty
scoreDic.isEmpty

// count
scoreDic.count

// update
scoreDic["Jason"] = 99
scoreDic

// add
scoreDic["Jack"] = 100
scoreDic

// delete
scoreDic["Jack"] = nil
scoreDic

// for loop
for (name, score) in scoreDic{
    print("\(name), \(score)")
}

for key in scoreDic.keys{
    print(key)
}

// delete
scoreDic = [:]
