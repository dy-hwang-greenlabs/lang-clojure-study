; \R [4 1 2 6 5] => (1 2 4 5 6)
; \L [4 1 2 6 5] => (6 5 4 2 1)

(defn flip [d a]
  (cond (= d \R) (sort a)
        (= d \L) (reverse (sort a))))
