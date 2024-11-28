## 1. **Commandes de base**

### `open`
- **Description** : Ouvre une URL dans le navigateur.
- **Exemple** :
  ```plaintext
  Command: open
  Target: https://example.com
  ```

### `set window size`
- **Description** : Définit la taille de la fenêtre du navigateur.
- **Exemple** :
  ```plaintext
  Command: set window size
  Target: 1280x800
  ```

---

## 2. **Commandes d’interaction avec les éléments**

### `click`
- **Description** : Clique sur un élément.
- **Exemple** :
  ```plaintext
  Command: click
  Target: css=button#submit
  ```

### `type`
- **Description** : Tape du texte dans un champ de saisie.
- **Exemple** :
  ```plaintext
  Command: type
  Target: css=input[name="username"]
  Value: myUsername
  ```

### `send keys`
- **Description** : Simule la saisie de touches au clavier.
- **Exemple** :
  ```plaintext
  Command: send keys
  Target: css=input[name="password"]
  Value: ${KEY_ENTER}
  ```

---

## 3. **Commandes de vérification**

### `assert element present`
- **Description** : Vérifie que l’élément est présent sur la page.
- **Exemple** :
  ```plaintext
  Command: assert element present
  Target: css=div.alert
  ```

### `assert text`
- **Description** : Vérifie qu’un texte spécifique est présent dans un élément.
- **Exemple** :
  ```plaintext
  Command: assert text
  Target: css=h1
  Value: Welcome to Selenium
  ```

### `verify element present`
- **Description** : Vérifie si un élément existe (non bloquant).
- **Exemple** :
  ```plaintext
  Command: verify element present
  Target: css=div#content
  ```

---

## 4. **Commandes conditionnelles**

### `if` / `else if` / `else`
- **Description** : Exécute des actions conditionnellement.
- **Exemple** :
  ```plaintext
  Command: if
  Target: ${userLoggedIn}
  ```
  ```plaintext
  Command: click
  Target: css=button#logout
  ```
  ```plaintext
  Command: end
  ```

---

## 5. **Commandes de stockage**

### `store`
- **Description** : Stocke une valeur statique.
- **Exemple** :
  ```plaintext
  Command: store
  Target: 42
  Value: answer
  ```

### `execute script`
- **Description** : Exécute du JavaScript et stocke le résultat.
- **Exemple** :
  ```plaintext
  Command: execute script
  Target: return document.title;
  Value: pageTitle
  ```

---

## 6. **Commandes de navigation**

### `go back`
- **Description** : Revient à la page précédente.
- **Exemple** :
  ```plaintext
  Command: go back
  ```

### `refresh`
- **Description** : Recharge la page actuelle.
- **Exemple** :
  ```plaintext
  Command: refresh
  ```

---

## 7. **Commandes d’attente**

### `wait for element visible`
- **Description** : Attend que l’élément soit visible.
- **Exemple** :
  ```plaintext
  Command: wait for element visible
  Target: css=div#loader
  ```

### `pause`
- **Description** : Met le script en pause pendant un certain temps (en millisecondes).
- **Exemple** :
  ```plaintext
  Command: pause
  Target: 5000
  ```

---

## 8. **Commandes de boucles**

### `repeat if`
- **Description** : Répète un ensemble d'actions si une condition est vraie.
- **Exemple** :
  ```plaintext
  Command: repeat if
  Target: javascript: document.querySelectorAll('li').length > 5
  ```

### `while`
- **Description** : Répète des commandes tant qu'une condition est vraie.
- **Exemple** :
  ```plaintext
  Command: while
  Target: javascript: !!document.querySelector('button.load-more')
  ```

---

## 9. **Commandes de capture**


### `echo`
- **Description** : Affiche une valeur ou un message dans la console.
- **Exemple** :
  ```plaintext
  Command: echo
  Target: Test completed successfully!
  ```

---

## 10. **Commandes personnalisées**

### `run script`
- **Description** : Exécute du JavaScript sans stocker le résultat.
- **Exemple** :
  ```plaintext
  Command: run script
  Target: alert('Hello, Selenium!');
  ```
