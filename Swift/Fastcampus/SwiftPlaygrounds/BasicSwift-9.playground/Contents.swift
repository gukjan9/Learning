import UIKit

var evenNumbers: [Int] = [2, 4, 6, 8]           // let - 수정 불가, var - 수정 가능
var evenNumbers2: Array<Int> = [2, 4, 6, 8]

// add elements
evenNumbers.append(10)
evenNumbers += [12, 14, 16]
evenNumbers.append(contentsOf: [18, 20])

// isEmpty
let isEmpty = evenNumbers.isEmpty

// count
evenNumbers.count

// print(evenNumbers.first)

// let firstItem = evenNumbers.first       // optional

if let firstElement = evenNumbers.first{
    print("First item is : \(firstElement)")
}

// 대소비교
evenNumbers.min()
evenNumbers.max()

var firstItem = evenNumbers[0]
var secondItem = evenNumbers[1]
var lastItem = evenNumbers[9]

// var twentithItem = evenNumbers[19]          // x

// range
let firstThree = evenNumbers[0...2]
evenNumbers

// find
evenNumbers.contains(3)
evenNumbers.contains(4)

// insert
evenNumbers.insert(0, at: 0)
evenNumbers

// delete
evenNumbers.remove(at: 0)
evenNumbers

// update
evenNumbers[0] = -2
evenNumbers

evenNumbers[0...2] = [-2, 0, 2]
evenNumbers

// swap
evenNumbers.swapAt(0, 9)

// print
for num in evenNumbers{
    print(num)
}

// index num
for (index, num) in evenNumbers.enumerated(){
    print("index: \(index), value: \(num)")
}

// delete (drop)
let firstThreeRemoved = evenNumbers.dropFirst(3)        // evenNumbers에 영향 없음
let lastOneRemoved = evenNumbers.dropLast(1)

// prefix, suffix
let prefixThree = evenNumbers.prefix(3)
let suffixThree = evenNumbers.suffix(3)

// all delete
evenNumbers.removeAll()
evenNumbers = []
evenNumbers
