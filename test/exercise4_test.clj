(ns exercise3-test
  (:require [clojure.test :refer :all]
            [exercise3 :refer :all]))

(deftest fibonacci-zero
  (testing "Tests fibonacci applied to 0."
    (is (= (fibonacci 0) 0))))

(deftest fibonacci-one
  (testing "Tests fibonacci applied to 1."
    (is (= (fibonacci 1) 1))))

(deftest fibonacci-two
  (testing "Tests fibonacci applied to 2."
    (is (= (fibonacci 2) 1))))
	
(deftest fibonacci-three
  (testing "Tests fibonacci applied to 3."
    (is (= (fibonacci 3) 2))))
	
(deftest fibonacci-four
  (testing "Tests fibonacci applied to 4."
    (is (= (fibonacci 4) 3))))	
	
(deftest fibonacci-five
  (testing "Tests fibonacci applied to 5."
    (is (= (fibonacci 5) 5))))		
	
(deftest fibonacci-six
  (testing "Tests fibonacci applied to 6."
    (is (= (fibonacci 6) 8))))			
	
(deftest fibonacci-seven
  (testing "Tests fibonacci applied to 7."
    (is (= (fibonacci 7) 13))))				
	
(deftest fibonacci-eight
  (testing "Tests fibonacci applied to 8."
    (is (= (fibonacci 8) 21))))
