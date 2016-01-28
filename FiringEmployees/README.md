#Problem Statement

BottomCoder has a CEO and N employees. The CEO has number 0, the employees are numbered 1 through N. Each employee can be described by three numbers: their **salary**, their **productivity**, and the number of their direct **manager**. For each employee E, employee E's manager has a number smaller than E. Hence, the company has a tree-like hierarchy.

You are given the description of BottomCoder in the integer arrays **manager**, **salary**, and **productivity**. For each i between 1 and N, inclusive, employee i is described by the values **manager**[i-1], **salary**[i-1], and **productivity**[i-1].

The profit from an employee can be computed as the employee's **productivity** minus their **salary**. Note that the profit from an employee can be negative. The total profit of the company is the sum of profits of its employees.

The CEO would like to increase the total profit of the company by firing some of its employees. However, if he fires an employee E, he must also fire all employees who reported to E. For example, if he fires your **manager**, he must fire you as well. As another example, if he fires the **manager** of your **manager**, he must fire your **manager** and therefore he must also fire you.

Find a valid way of firing some (possibly none, possibly all) employees that maximizes the profit of the resulting company. Return the total profit after the selected employees are fired.

##Definition
 - Class: `FiringEmployees`
 - Method: `fire`
 - Parameters: `int[], int[], int[]`
 - Returns: `int`
 - Method signature: `int fire(int[] manager, int[] salary, int[] productivity)` (be sure your method is public)

#Limits
 - Time limit (s): `2.000`
 - Memory limit (MB): `256`

#Notes
 - The CEO of BottomCoder has both salary and productivity equal to zero. The CEO cannot be fired.

#Constraints
 - **manager**, **salary** and **productivity** will contain N elements each.
 - manager** will contain between 1 and 2500 elements inclusive.
 - Each element of **salary** will be between 1 and 10,000 inclusive.
 - Each element of **productivity** will be between 1 and 10,000 inclusive.
 - The i-th element of **manager** will be between 0 and i inclusive.
