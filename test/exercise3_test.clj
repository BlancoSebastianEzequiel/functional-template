(ns exercise3-test
  (:require [clojure.test :refer :all]
            [exercise3 :refer :all]))

(def mapa {:a nil :b 1 :c 2})

(deftest key-a-is-null
  (testing "test if key a is null"
    (is (= (mapa-key-nula mapa :a) true))))

(deftest key-b-is-null
  (testing "test if key b is null"
    (is (= (mapa-key-nula mapa :b) false))))

(deftest key-c-is-null
  (testing "test if key c is null"
    (is (= (mapa-key-nula mapa :c) false))))

