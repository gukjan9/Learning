//
//  DetailViewController.swift
//  BountyList
//
//  Created by GukJang on 2021/06/16.
//

import UIKit

class DetailViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    
    @IBAction func close(_ sender: Any) {                   // 버튼을 control 누른 상태로 코드창에 끌고 오기
        dismiss(animated: true, completion: nil)            // 버튼 누르면 창 닫히기
    }
    
}
