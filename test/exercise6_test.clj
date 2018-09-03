(ns exercise6-test
  (:require [clojure.test :refer :all]
            [exercise6 :refer :all]))

(deftest flast-of-array-of-numbers
  (testing "Returns the last element of an array of numbers."
    (is (= (ultimo [1 2 3 4 5]) 5))))

(deftest flast-of-a-list-of-numbers
  (testing "Returns the last element of a list of numbers."
    (is (= (ultimo '(5 4 3)) 3))))

(deftest flast-of-array-of-strings
  (testing "Returns the last element of an array of strings."
    (is (= (ultimo ["a" "b" "c" "d"]) "d"))))

(deftest flast-of-a-list-of-strings
  (testing "Returns the last element of a list of strings."
    (is (= (ultimo '("a" "b" "c")) "c"))))
