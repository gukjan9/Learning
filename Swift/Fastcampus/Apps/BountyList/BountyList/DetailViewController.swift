//
//  DetailViewController.swift
//  BountyList
//
//  Created by GukJang on 2021/06/16.
//

import UIKit

class DetailViewController: UIViewController {
    
    @IBOutlet weak var imgView: UIImageView!
    @IBOutlet weak var nameLabel: UILabel!
    @IBOutlet weak var bountyLabel: UILabel!

    var name: String?
    var bounty: Int?
    
    override func viewDidLoad() {           // 뜨기 직전
        super.viewDidLoad()
        updateUI()
    }
    
    func updateUI(){
        if let name = self.name, let bounty = self.bounty{
            let img = UIImage(named: "\(name).jpg")
            imgView.image = img
            nameLabel.text = name
            bountyLabel.text = "\(bounty)"
        }
    }
    
    
    @IBAction func close(_ sender: Any) {                   // 버튼을 control 누른 상태로 코드창에 끌고 오기
        dismiss(animated: true, completion: nil)            // 버튼 누르면 창 닫히기
    }
}
