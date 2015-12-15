#lang racket

(define words (list "METAMORPHICALLY"
                    "PHARMACEUTICALS"
                    "STRAIGHTJACKETS"
                    "VULNERABILITIES"
                    "NONPROFESSIONAL"
                    "MISCALCULATIONS"
                    "MICROSCOPICALLY"
                    "IMMORTALISATION"
                    "HYPERACTIVITIES"
                    "HETEROSEXUALITY"
                    "DISSATISFACTION"))

(define finalWord (list-ref words (random (length words))))

(define wrongLetters (list ))

(define knownLetters (list->string (list #\_ #\_ #\_ #\_ #\_ #\_ #\_ #\_ #\_ #\_ #\_ #\_ #\_ #\_ #\_ )))
;(define knownLetters "_______________")

(define hangman 8)

(define (guess g)
  ;(define (firstLetters x p)
    ;(cond
      ;[(equal? p x) '()]
      ;[(< x p) (cons (list-ref knownLetters x)(firstLetters (+ x 1) p))]))
  (define hasFound 0)
  (define (addWrong st)
    (set! wrongLetters (append wrongLetters (list st))))
  (define (loseLife gu)
    (addWrong gu)
    (set! hangman (- hangman 1)))
  (define (checkLetter st en l)
    (cond
      [(> en (string-length finalWord))
       (if (and (equal? hasFound 0) (not (member g wrongLetters)))
           (loseLife g)
           #f)]
      [(equal? l (substring finalWord st en))
       (printf "correct guess! on place ~a\n" st)
       (set! hasFound 1)
       (string-set! knownLetters st (string-ref g 0))
       ;(set! knownLetters (append (firstLetters 0 st) (append (list g) (list-tail knownLetters st))))
       (checkLetter (+ st 1) (+ en 1) l)
       #t]
      [else (checkLetter (+ st 1) (+ en 1) l)]))
  
    
  (if (equal? (string-length g) 1)
      (checkLetter 0 1 g)
      (println "Wrong input format"))
  (if (equal? hangman 0)
      (println "you are dead")
      (printf "You have ~a lives left\n" (number->string hangman)))
  (if (not (string-contains? knownLetters "_"))
      (println "You WIN!")
      (println "There are still letters to go!")))