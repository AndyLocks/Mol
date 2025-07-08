# Category of Molecular Reactions

This is a **multicategory** \\(\mathbf{Mol}\\), in which all **objects** are molecules. These molecules have no names or identifiers within this category — they are abstract molecules. However, for convenience, we will refer to them using familiar names such as \\(\mathsf{H\_2O}\\). Later, when discussing functors, we will treat the names of molecules as a separate structure. So for now, we can say something like:

$$
\mathrm{Ob}(\mathbf{Mol}) = \\{ \mathsf{H_2O}, \mathsf{O_2}, \mathsf{NaOH}, \dots \\}
$$

But you are free to name the molecules however you want — with letters, shapes, or remain purely abstract. For convenience, though, we’ll use familiar chemical names.

## Morphisms

Morphisms in this category represent generalized reactions. We are not concerned with the number of molecules involved or the specific type of reaction (e.g., combustion, substitution, oxidation). We focus solely on which molecules can produce which others — the *possibility* of transformation, not the mechanism. Even if we haven’t discovered a certain reaction yet, we can still operate *as if* such a transformation exists (via future discoveries or compositions of existing reactions). Just like in \\(\mathbf{Set}\\), where a transition between sets can be realized through infinitely many possible functions.

Behind these morphisms lies standard chemistry: ordinary reaction equations with the same meaning as functions in \\(\mathbf{Set}\\).

Let’s look at a few examples.

---

### 1. Combustion of Methane (an organic oxidation reaction):

**Chemical Equation:**

$$
\mathsf{CH_3(g) + 2O_2(g) \rightarrow CO_2(g) + 2H_2O(g)}
$$

**Morphisms:**

$$
f_1 : (\mathsf{CH_3}, \mathsf{O_2}) \to  \mathsf{CO_2}
$$

$$
f_2 : (\mathsf{CH_3}, \mathsf{O_2}) \to  \mathsf{H_2O}
$$

**Reaction Type:** Oxidation (combustion), exothermic.

**Explanation:**
This reaction has two morphisms because it has two products. For compositional clarity, it's better to define two morphisms instead of one with multiple outputs. Also, note that we **ignore molecule counts** (e.g., we use \\(\mathsf{H\_2O}\\) instead of \\(2\mathsf{H\_2O}\\)). At this level of abstraction, we care only about the presence of transformations.

---

### 2. Neutralization: Sodium hydroxide + Hydrochloric acid

**Chemical Equation:**

$$
\mathsf{NaOH(aq) + HCl(aq) \rightarrow NaCl(aq) + H_2O(l)}
$$

**Morphisms:**

$$
f_1 : (\mathsf{NaOH}, \mathsf{HCl}) \to  \mathsf{NaCl}
$$

$$
f_2 : (\mathsf{NaOH}, \mathsf{HCl}) \to  \mathsf{H_2O}
$$

**Reaction Type:** Double replacement, neutralization, exothermic.

---

### 3. Decomposition of Hydrogen Peroxide

**Chemical Equation:**

$$
\mathsf{2H_2O_2(aq) \rightarrow 2H_2O(l) + O_2(g)}
$$

**Morphisms:**

$$
f_1 : \mathsf{H_2O_2} \to  \mathsf{H_2O}
$$

$$
f_2 : \mathsf{H_2O_2} \to  \mathsf{O_2}
$$

**Reaction Type:** Decomposition, redox.

---

### 4. Single Replacement: Zinc + Hydrochloric Acid

**Chemical Equation:**

$$
\mathsf{Zn(s) + 2HCl(aq) \rightarrow ZnCl_2(aq) + H_2(g)}
$$

**Morphisms:**

$$
f_1 : (\mathsf{Zn}, \mathsf{HCl}) \to  \mathsf{ZnCl_2}
$$

$$
f_2 : (\mathsf{Zn}, \mathsf{HCl}) \to  \mathsf{H_2}
$$

**Reaction Type:** Substitution, redox.

---

### 5. Thermal Decomposition of Calcium Carbonate

**Chemical Equation:**

$$
\mathsf{CaCO_3(s) \xrightarrow{Δ} CaO(s) + CO_2(g)}
$$

**Morphisms:**

$$
f_1 : \mathsf{CaCO_3} \to \mathsf{CaO}
$$

$$
f_2 : \mathsf{CaCO_3} \to \mathsf{CO_2}
$$

**Reaction Type:** Decomposition.

## Identity Morphisms

Every object has an identity morphism:

$$
\forall o \in \mathrm{Ob}(\mathbf{Mol}) : \mathrm{id}\_o \in \mathrm{Hom}_{\mathbf{Mol}}(o, o)
$$

For example:

$$
id_{H_2O} : H_2O \to H_2O
$$

$$
id_{O_2} : O_2 \to O_2
$$

Usually, this means the molecule is simply at rest, and no reaction occurs. But sometimes it could represent a change in physical state:

$$
\mathsf{Br_{2(g)}} \to \mathsf{Br_{2(l)}} \to \mathsf{Br_{2(s)}}
$$

However, since we abstract away from quantities and reaction pathways, and focus only on participants and reaction possibility, we treat it as:

$$
id_{Br_2} : Br_2 \to Br_2
$$

## Composition

Let’s say we have a morphism:

$$
f : (A_1, A_2, ..., A_n) \to B
$$

And for each \\(A\_i\\), we have a morphism:

$$
g_i : (B_{i1}, ..., B_{im_i}) \to A_i
$$

Then we can compose them into:

$$
f \circ (g_1, ..., g_n) : (B_{11}, ..., B_{1m_1}, ..., B_{n1}, ..., B_{nm_n}) \to B
$$

Example:

If

\\(f: (A, B) \to C\\)  
\\(g: (D, E) \to A\\)

Then:

$$
f \circ (g, id_B) : (D, E) \to C
$$

Let’s now derive this reaction:

$$
(\mathsf{CH_3}, \mathsf{O_2}) \to \mathsf{NaOH}
$$

Let’s imagine we don't yet know if this is possible, and try to **construct it** using known reactions.

We start with a known reaction:

$$
\mathsf{Na_2O} + \mathsf{H_2O} \rightarrow \mathsf{2NaOH}
$$

This gives us a morphism:

$$
f : (\mathsf{Na_2O}, \mathsf{H_2O}) \to \mathsf{NaOH}
$$

Now, we need a way to get \\(\mathsf{H_2O}\\). One known reaction is:

$$
\mathsf{CH_3(g) + 2O_2(g) \rightarrow CO_2(g) + 2H_2O(g)}
$$

Which gives us:

$$
g : (\mathsf{CH_3}, \mathsf{O_2}) \to \mathsf{H_2O}
$$

So we can form the composition:

$$
f \circ (id_{\mathsf{Na_2O}}, g) : (\mathsf{CH_3}, \mathsf{O_2}) \to \mathsf{NaOH}
$$


Let’s again take the morphism \\(f\\):

$$
f : (\mathsf{Na_2O}, \ \mathsf{H_2O}) \to  \mathsf{NaOH}
$$

And think: what other compositions can be constructed?
Essentially, the number of such compositions equals the number of ways to obtain \\(\mathsf{H\_2O}\\) \\(\times\\) the number of ways to obtain \\(\mathsf{Na\_2O}\\).
We already know a few ways to derive \\(\mathsf{H\_2O}\\) from the reactions mentioned above:

$$
g_1 : \mathsf{H_2O_2} \to \mathsf{H_2O}
$$

$$
g_2 : (\mathsf{NaOH}, \mathsf{HCl}) \to \mathsf{H_2O}
$$

$$
g_3 : (\mathsf{CH_3}, \mathsf{O_2}) \to \mathsf{H_2O}
$$

Then:

$$
f \circ (id_{\mathsf{Na_2O}}, g_1) : \mathsf{H_2O_2} \to \mathsf{NaOH}
$$

$$
f \circ (id_{\mathsf{Na_2O}}, g_2) : (\mathsf{NaOH}, \mathsf{HCl}) \to \mathsf{NaOH}
$$

$$
f \circ (id_{\mathsf{Na_2O}}, g_3) : (\mathsf{CH_3}, \mathsf{O_2}) \to \mathsf{NaOH}
$$

Now let’s find ways to produce \\(\mathsf{Na_2O}\\):

$$
4\mathsf{Na} + \mathsf{O_2} \rightarrow 2\mathsf{Na_2O}
$$

$$
2\mathsf{Na_2O_2} \xrightarrow{t} 2\mathsf{Na_2O} + \mathsf{O_2}
$$

Which give:

$$
h_1 : (\mathsf{Na}, \mathsf{O_2}) \to \mathsf{Na_2O}
$$

$$
h_2 : \mathsf{Na_2O_2} \to \mathsf{Na_2O}
$$

Now we can compose:

$$
f \circ (h_1, g_1) : (\mathsf{Na}, \mathsf{O_2}, \mathsf{H_2O_2}) \to \mathsf{NaOH}
$$

$$
f \circ (h_1, g_2) : (\mathsf{Na}, \mathsf{O_2}, \mathsf{NaOH}, \mathsf{HCl}) \to \mathsf{NaOH}
$$

$$
f \circ (h_1, g_3) : (\mathsf{Na}, \mathsf{CH_3}, \mathsf{O_2}) \to \mathsf{NaOH}
$$

$$
f \circ (h_2, g_1) : (\mathsf{Na_2O_2}, \mathsf{H_2O_2}) \to \mathsf{NaOH}
$$

$$
f \circ (h_2, g_2) : (\mathsf{Na_2O_2}, \mathsf{NaOH}, \mathsf{HCl}) \to \mathsf{NaOH}
$$

$$
f \circ (h_2, g_3) : (\mathsf{Na_2O_2}, \mathsf{CH_3}, \mathsf{O_2}) \to \mathsf{NaOH}
$$

---

Let’s now take another look at the morphisms \\(h\_1\\) and \\(h\_2\\):

$$
h_1 : (\mathsf{Na}, \ \mathsf{O_2}) \to \mathsf{Na_2O}
$$

$$
h_2 : \mathsf{Na_2O_2} \to \mathsf{Na_2O}
$$

Notably, we can produce \\(\mathsf{Na\_2O\_2}\\) from \\(\mathsf{Na}\\) and \\(\mathsf{O\_2}\\) via the following reaction:

$$
\mathsf{2Na + O_2} \to \mathsf{Na_2O_2}
$$

This means there exists a morphism:

$$
k: (\mathsf{Na}, \ \mathsf{O_2}) \to \mathsf{Na_2O_2}
$$

Which implies that the morphism \\(h\_1\\) can be expressed as the composition:

$$
h_2 \circ k : (\mathsf{Na}, \ \mathsf{O_2}) \to \mathsf{Na_2O}
$$
