//
//  ViewController.swift
//  MyAlbum
//
//  Created by GukJang on 2021/04/02.
//

import UIKit

class ViewController: UIViewController {
    
    var currentValue = 0        // option 누르고 ? 클릭하면 타입형 나옴

    @IBOutlet weak var priceLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        refresh()
    }
    
    @IBAction func showAlert(_ sender: Any) {
        let message = "가격은 ₩\(currentValue) 입니다"
        
        let alert = UIAlertController(title : "Hello",
                                      message : message,
                                      preferredStyle : .alert)
        let action = UIAlertAction(title : "OK",
                                   style : .default,
                                   handler : { action in        // closure
                                    self.refresh()
                                   })
        alert.addAction(action)
        present(alert, animated : true, completion : nil)
    }
    
    func refresh(){         // method
        let randomPrice = arc4random_uniform(10000) + 1     // 0 ~ 9999 까지 수 리턴하므로 +1 해주기
        currentValue = Int(randomPrice)
        priceLabel.text = "₩ \(currentValue)"
    }
}

// appicon generator

