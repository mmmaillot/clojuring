(ns kmeans.core
  (:require [clojure.test.check.generators :as gen]))

(defn dot [x y]
  "Dot product between two vectors"
  (reduce + (map * x y)))

(defn euclideanDistance [x y]
  "Compute the euclidean distance between two points"
  (let [z (map - x y)]
    (Math/sqrt (dot z z))))

(defn closest-of-2-clusters [x y z distance]
  (let [dist-y (distance x y) dist-z (distance x z)]
    (if (< dist-y dist-z)
      y
      z)))

(defn closest [x means distance]
  )

