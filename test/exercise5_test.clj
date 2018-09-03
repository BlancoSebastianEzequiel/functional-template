(ns exercise5-test
  (:require [clojure.test :refer :all]
            [exercise5 :refer :all]))

(deftest summary-array
  (testing "Tests sum applied to an array of numbers."
    (is (= (sumar [1 2 3]) 6))))

(deftest summary-list
  (testing "Tests sum applied to a list of numbers."
    (is (= (sumar (list 0 -2 5 5)) 8))))	
	
(deftest summary-set
  (testing "Tests sum applied to a set of numbers."
    (is (= (sumar #{4 2 1}) 7))))	
	
(deftest summary-negative
  (testing "Tests sum applied to a sequence with negative numbers."
    (is (= (sumar '(0 0 -1)) -1))))

(deftest summary-positive
  (testing "Tests sum applied to a sequence with all positive numbers."
    (is (= (sumar '(1 10 3)) 14))))
